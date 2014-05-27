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

@SuppressWarnings("all") public class throw_$Current$File_1_1 extends Strategy 
{ 
  public static throw_$Current$File_1_1 instance = new throw_$Current$File_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_92076, IStrategoTerm y_92076)
  { 
    context.push("throw_CurrentFile_1_1");
    Fail76114:
    { 
      IStrategoTerm b_92077 = null;
      b_92077 = term;
      term = dr_throw_1_2.instance.invoke(context, b_92077, z_92076, y_92076, trans.const15448);
      if(term == null)
        break Fail76114;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}