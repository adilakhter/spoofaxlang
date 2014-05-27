package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class remove_stratego_bodies_0_0 extends Strategy 
{ 
  public static remove_stratego_bodies_0_0 instance = new remove_stratego_bodies_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("remove_stratego_bodies_0_0");
    Fail23142:
    { 
      IStrategoTerm term12472 = term;
      IStrategoConstructor cons591 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12379:
      { 
        if(cons591 == Main._consSDefT_4)
        { 
          Fail23143:
          { 
            IStrategoTerm v_4788 = null;
            IStrategoTerm w_4788 = null;
            IStrategoTerm x_4788 = null;
            IStrategoTerm y_4788 = null;
            IStrategoTerm z_4788 = null;
            IStrategoTerm c_4789 = null;
            v_4788 = term.getSubterm(0);
            w_4788 = term.getSubterm(1);
            x_4788 = term.getSubterm(2);
            y_4788 = term.getSubterm(3);
            c_4789 = term;
            IStrategoTerm term12473 = term;
            Success12380:
            { 
              Fail23144:
              { 
                term = collect_all_1_0.instance.invoke(context, y_4788, lifted6871.instance);
                if(term == null)
                  break Fail23144;
                z_4788 = term;
                if(true)
                  break Success12380;
              }
              term = term12473;
              IStrategoTerm a_4789 = null;
              IStrategoTerm b_4789 = null;
              IStrategoTerm e_4789 = null;
              a_4789 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23143;
              b_4789 = term;
              e_4789 = a_4789;
              term = report_with_failure_0_2.instance.invoke(context, e_4789, trans.const4594, b_4789);
              if(term == null)
                break Fail23143;
            }
            term = c_4789;
            if(z_4788 == null)
              break Fail23143;
            term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{v_4788, w_4788, x_4788, z_4788});
            if(true)
              break Success12379;
          }
          term = term12472;
        }
        Success12381:
        { 
          if(cons591 == Main._consImport_1)
          { 
            Fail23145:
            { 
              term = trans.const4595;
              if(true)
                break Success12381;
            }
            term = term12472;
          }
          if(cons591 == Main._consImportWildcard_1)
          { 
            term = trans.const4595;
          }
          else
          { 
            break Fail23142;
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}