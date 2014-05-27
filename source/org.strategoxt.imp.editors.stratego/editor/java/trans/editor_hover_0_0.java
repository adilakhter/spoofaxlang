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

@SuppressWarnings("all") public class editor_hover_0_0 extends Strategy 
{ 
  public static editor_hover_0_0 instance = new editor_hover_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_hover_0_0");
    Fail23346:
    { 
      IStrategoTerm term12685 = term;
      Success12555:
      { 
        Fail23347:
        { 
          IStrategoTerm d_4826 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
            break Fail23347;
          d_4826 = term.getSubterm(0);
          term = signature_of_0_0.instance.invoke(context, d_4826);
          if(term == null)
            break Fail23347;
          term = pp_stratego_string_0_0.instance.invoke(context, d_4826);
          if(term == null)
            break Fail23347;
          if(true)
            break Success12555;
        }
        term = term12685;
        IStrategoTerm t_4825 = null;
        IStrategoTerm u_4825 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
          break Fail23346;
        IStrategoTerm arg8355 = term.getSubterm(0);
        t_4825 = arg8355;
        if(arg8355.getTermType() != IStrategoTerm.APPL || Main._consToMetaExpr_1 != ((IStrategoAppl)arg8355).getConstructor())
          break Fail23346;
        term = meta_explode_1_0.instance.invoke(context, t_4825, false_0_0.instance);
        if(term == null)
          break Fail23346;
        term = $Stratego_$Ensugar_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23346;
        u_4825 = term;
        term = pp_stratego_string_0_0.instance.invoke(context, u_4825);
        if(term == null)
          break Fail23346;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const4662, termFactory.makeListCons(term, (IStrategoList)trans.constCons2124));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23346;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}