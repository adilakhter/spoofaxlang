package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Is$Import$Failed_0_2 extends Strategy 
{ 
  public static aux_$Is$Import$Failed_0_2 instance = new aux_$Is$Import$Failed_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_92098, IStrategoTerm k_92098)
  { 
    Fail76241:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"-48817".equals(((IStrategoString)term).stringValue()))
        break Fail76241;
      term = j_92098;
      if(true)
        return term;
    }
    context.push("aux_IsImportFailed_0_2");
    context.popOnFailure();
    return null;
  }
}