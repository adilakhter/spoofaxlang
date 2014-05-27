package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class create_build_properties_0_0 extends Strategy 
{ 
  public static create_build_properties_0_0 instance = new create_build_properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_build_properties_0_0");
    Fail26702:
    { 
      Success10896:
      { 
        Fail26703:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7847);
          if(term == null)
            break Fail26703;
          if(true)
            break Success10896;
        }
        IStrategoTerm g_4388 = null;
        IStrategoTerm i_4388 = null;
        IStrategoTerm j_4388 = null;
        i_4388 = generator.const7848;
        g_4388 = generator.constNil7;
        j_4388 = i_4388;
        term = output_text_file_0_2.instance.invoke(context, j_4388, g_4388, generator.const7847);
        if(term == null)
          break Fail26702;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}