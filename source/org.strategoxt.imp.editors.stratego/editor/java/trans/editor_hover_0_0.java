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
    Fail21870:
    { 
      IStrategoTerm term11976 = term;
      Success11846:
      { 
        Fail21871:
        { 
          IStrategoTerm l_4272 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
            break Fail21871;
          l_4272 = term.getSubterm(0);
          term = signature_of_0_0.instance.invoke(context, l_4272);
          if(term == null)
            break Fail21871;
          term = pp_stratego_string_0_0.instance.invoke(context, l_4272);
          if(term == null)
            break Fail21871;
          if(true)
            break Success11846;
        }
        term = term11976;
        IStrategoTerm b_4272 = null;
        IStrategoTerm c_4272 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
          break Fail21870;
        IStrategoTerm arg7888 = term.getSubterm(0);
        b_4272 = arg7888;
        if(arg7888.getTermType() != IStrategoTerm.APPL || Main._consToMetaExpr_1 != ((IStrategoAppl)arg7888).getConstructor())
          break Fail21870;
        term = meta_explode_1_0.instance.invoke(context, b_4272, false_0_0.instance);
        if(term == null)
          break Fail21870;
        term = $Stratego_$Ensugar_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21870;
        c_4272 = term;
        term = pp_stratego_string_0_0.instance.invoke(context, c_4272);
        if(term == null)
          break Fail21870;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const4452, termFactory.makeListCons(term, (IStrategoList)trans.constCons2043));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21870;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}