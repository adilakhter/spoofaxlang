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

@SuppressWarnings("all") public class declare_var_0_0 extends Strategy 
{ 
  public static declare_var_0_0 instance = new declare_var_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_var_0_0");
    Fail23207:
    { 
      IStrategoTerm s_4806 = null;
      IStrategoTerm t_4806 = null;
      IStrategoTerm w_4806 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail23207;
      s_4806 = term.getSubterm(0);
      w_4806 = term;
      IStrategoTerm term12535 = term;
      Success12432:
      { 
        Fail23208:
        { 
          term = declare_definition_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23208;
          term = termFactory.annotateTerm(s_4806, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
          t_4806 = term;
          if(true)
            break Success12432;
        }
        term = term12535;
        IStrategoTerm u_4806 = null;
        IStrategoTerm v_4806 = null;
        IStrategoTerm a_4807 = null;
        u_4806 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23207;
        v_4806 = term;
        a_4807 = u_4806;
        term = report_with_failure_0_2.instance.invoke(context, a_4807, trans.const4610, v_4806);
        if(term == null)
          break Fail23207;
      }
      term = w_4806;
      if(t_4806 == null)
        break Fail23207;
      term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{t_4806});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}