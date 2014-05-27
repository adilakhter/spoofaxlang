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

@SuppressWarnings("all") public class fold_$Is$Imported_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported_1_0 instance = new fold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4839)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail23438:
    { 
      IStrategoTerm z_4838 = null;
      IStrategoTerm d_4839 = null;
      IStrategoTerm f_4839 = null;
      z_4838 = term;
      f_4839 = term;
      Success12588:
      { 
        Fail23439:
        { 
          IStrategoTerm h_4839 = null;
          h_4839 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_4839, trans.const4537, z_4838);
          if(term == null)
            break Fail23439;
          if(true)
            break Success12588;
        }
        term = trans.constNil4;
      }
      d_4839 = term;
      term = f_4839;
      term = termFactory.makeTuple(d_4839, term);
      term = c_4839.invoke(context, term, lifted6986.instance);
      if(term == null)
        break Fail23438;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}