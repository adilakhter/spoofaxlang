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

@SuppressWarnings("all") public class bigfold_$Decorated$Ast_1_0 extends Strategy 
{ 
  public static bigfold_$Decorated$Ast_1_0 instance = new bigfold_$Decorated$Ast_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4293)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DecoratedAst_1_0");
    Fail22012:
    { 
      IStrategoTerm h_4293 = null;
      IStrategoTerm j_4293 = null;
      j_4293 = term;
      Success11892:
      { 
        Fail22013:
        { 
          IStrategoTerm k_4293 = null;
          IStrategoTerm m_4293 = null;
          IStrategoTerm n_4293 = null;
          m_4293 = term;
          k_4293 = trans.const4355;
          n_4293 = m_4293;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, n_4293, k_4293, trans.constCons1966);
          if(term == null)
            break Fail22013;
          if(true)
            break Success11892;
        }
        term = trans.constNil3;
      }
      h_4293 = term;
      term = j_4293;
      term = termFactory.makeTuple(h_4293, term);
      term = g_4293.invoke(context, term, lifted6732.instance);
      if(term == null)
        break Fail22012;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}