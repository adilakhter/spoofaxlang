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

@SuppressWarnings("all") public class declaration_of_0_0 extends Strategy 
{ 
  public static declaration_of_0_0 instance = new declaration_of_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("declaration_of_0_0");
    Fail23066:
    { 
      term = signature_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23066;
      IStrategoTerm term12395 = term;
      Success12320:
      { 
        Fail23067:
        { 
          IStrategoTerm t_4774 = null;
          IStrategoList annos708 = term.getAnnotations();
          if(annos708.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos708).isEmpty())
            break Fail23067;
          t_4774 = ((IStrategoList)annos708).head();
          IStrategoTerm arg8205 = ((IStrategoList)annos708).tail();
          if(arg8205.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8205).isEmpty())
            break Fail23067;
          term = $Declaration_0_0.instance.invoke(context, t_4774);
          if(term == null)
            break Fail23067;
          if(true)
            break Success12320;
        }
        term = term12395;
        IStrategoTerm term12396 = term;
        Success12321:
        { 
          Fail23068:
          { 
            IStrategoTerm u_4774 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail23068;
            IStrategoTerm arg8206 = term.getSubterm(0);
            IStrategoList annos709 = arg8206.getAnnotations();
            if(annos709.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos709).isEmpty())
              break Fail23068;
            u_4774 = ((IStrategoList)annos709).head();
            IStrategoTerm arg8207 = ((IStrategoList)annos709).tail();
            if(arg8207.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8207).isEmpty())
              break Fail23068;
            term = $Declaration_0_0.instance.invoke(context, u_4774);
            if(term == null)
              break Fail23068;
            if(true)
              break Success12321;
          }
          term = term12396;
          IStrategoTerm v_4774 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail23066;
          IStrategoTerm arg8209 = term.getSubterm(0);
          IStrategoList annos710 = arg8209.getAnnotations();
          if(annos710.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos710).isEmpty())
            break Fail23066;
          v_4774 = ((IStrategoList)annos710).head();
          IStrategoTerm arg8210 = ((IStrategoList)annos710).tail();
          if(arg8210.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8210).isEmpty())
            break Fail23066;
          term = $Declaration_0_0.instance.invoke(context, v_4774);
          if(term == null)
            break Fail23066;
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