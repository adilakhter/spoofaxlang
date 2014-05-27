package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Is$Imported_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported_1_0 instance = new bigfold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4643)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail23011:
    { 
      IStrategoTerm b_4643 = null;
      IStrategoTerm f_4643 = null;
      IStrategoTerm h_4643 = null;
      b_4643 = term;
      h_4643 = term;
      Success12224:
      { 
        Fail23012:
        { 
          IStrategoTerm j_4643 = null;
          j_4643 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4643, trans.const4487, b_4643);
          if(term == null)
            break Fail23012;
          if(true)
            break Success12224;
        }
        term = trans.constNil4;
      }
      f_4643 = term;
      term = h_4643;
      term = termFactory.makeTuple(f_4643, term);
      term = e_4643.invoke(context, term, lifted6903.instance);
      if(term == null)
        break Fail23011;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}