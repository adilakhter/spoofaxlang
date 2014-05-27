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

@SuppressWarnings("all") public class bigchain_$Decorated$Ast_0_0 extends Strategy 
{ 
  public static bigchain_$Decorated$Ast_0_0 instance = new bigchain_$Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_DecoratedAst_0_0");
    Fail22016:
    { 
      IStrategoTerm e_4294 = null;
      IStrategoTerm g_4294 = null;
      g_4294 = term;
      Success11894:
      { 
        Fail22017:
        { 
          IStrategoTerm h_4294 = null;
          IStrategoTerm j_4294 = null;
          IStrategoTerm k_4294 = null;
          j_4294 = term;
          h_4294 = trans.const4355;
          k_4294 = j_4294;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, k_4294, h_4294, trans.constCons1966);
          if(term == null)
            break Fail22017;
          if(true)
            break Success11894;
        }
        term = trans.constNil3;
      }
      e_4294 = term;
      term = g_4294;
      term = termFactory.makeTuple(e_4294, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6734.instance);
      if(term == null)
        break Fail22016;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}