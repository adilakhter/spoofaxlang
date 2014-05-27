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

@SuppressWarnings("all") public class bigchain_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported_0_0 instance = new bigchain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImported_0_0");
    Fail23440:
    { 
      IStrategoTerm l_4839 = null;
      IStrategoTerm o_4839 = null;
      IStrategoTerm q_4839 = null;
      l_4839 = term;
      q_4839 = term;
      Success12589:
      { 
        Fail23441:
        { 
          IStrategoTerm s_4839 = null;
          s_4839 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, s_4839, trans.const4537, l_4839);
          if(term == null)
            break Fail23441;
          if(true)
            break Success12589;
        }
        term = trans.constNil4;
      }
      o_4839 = term;
      term = q_4839;
      term = termFactory.makeTuple(o_4839, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6987.instance);
      if(term == null)
        break Fail23440;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}